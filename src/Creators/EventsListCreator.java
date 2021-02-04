package Creators;

import Models.AbstractModel;
import Models.EventsList;
import Util.NodeCreatorUtil;
import Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class EventsListCreator implements Create {
    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {

        List<AbstractModel> eventsList = new ArrayList<>();

        Element eventsListElement = element;

        if (eventsListElement.children().size() > 0) {

            for (Element singleEvent : eventsListElement.children()) {

                EventsList eventsListTable = createEventListTable(sparkid, singleEvent);

                eventsList.add(eventsListTable);

            }
        }

        return eventsList;
    }

    private EventsList createEventListTable(String sparkid, Element singleEvent) {
        EventsList eventsListTable = new EventsList();

        eventsListTable.setSparkId(sparkid);

        eventsListTable.setEventDate(NodeCreatorUtil.getJsoupElemText(singleEvent.selectFirst("EventDate")));

        eventsListTable.setEventTypeDescription(NodeCreatorUtil.getJsoupElemText(singleEvent.selectFirst("EventTypeDescription")));

        eventsListTable.setEventTypeId(Integer.parseInt(NodeCreatorUtil.getJsoupElemText(singleEvent.selectFirst("EventTypeId"))));

        eventsListTable.setGUID(NodeCreatorUtil.createGuid());

        eventsListTable.setCurr("1");

        eventsListTable.setLastchgdatetime(TimeStamp.getTimeStamp());

        return eventsListTable;
    }
}
