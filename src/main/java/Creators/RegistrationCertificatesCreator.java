package Creators;

import Models.AbstractModel;
import Models.RegistrationCertificates;
import Util.NodeCreatorUtil;
import Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class RegistrationCertificatesCreator implements Create{


    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> registrationCertificatesList = new ArrayList<>();

        if (element.children().size() > 0) {

            for (Element certificate : element.children()) {
                RegistrationCertificates certificateRow = new RegistrationCertificates();

                certificateRow.setSparkid(sparkid);

                certificateRow.setGRN(NodeCreatorUtil.getJsoupElemAttrib(certificate,"GRN"));

                certificateRow.setIssueDate(NodeCreatorUtil.getJsoupElemAttrib(certificate,"IssueDate"));

                certificateRow.setNumber(NodeCreatorUtil.getJsoupElemAttrib(certificate,"Number"));

                certificateRow.setSeries(NodeCreatorUtil.getJsoupElemAttrib(certificate,"Series"));

                certificateRow.setLastchgdatetime(TimeStamp.getTimeStamp());

                certificateRow.setGUID(NodeCreatorUtil.createGuid());

                certificateRow.setCurr("1");

                registrationCertificatesList.add(certificateRow);

            }

        }

        return registrationCertificatesList;
    }
}
