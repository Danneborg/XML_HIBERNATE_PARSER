package project.Creators;

import project.Models.AbstractModel;
import org.jsoup.nodes.Element;

import java.util.List;

public interface Create {

    public List<AbstractModel> createModels(Element element,String sparkid);

}
