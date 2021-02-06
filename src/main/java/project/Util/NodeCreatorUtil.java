package project.Util;

import java.util.UUID;

public class NodeCreatorUtil {

    public static String createGuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static String getJsoupElemText(org.jsoup.nodes.Element e) {
        String result = "";
        try {
            if (e != null) {
                return e.ownText();
            }
        } catch (Exception e1) {
            return "";
        }

        return result;
    }

    public static String getJsoupElemAttrib(org.jsoup.nodes.Element e, String attribKey) {
        String result = "";
        if (e != null) {
            result = e.attr(attribKey);
        }
        return result;
    }

    public static boolean checkJsoupElem(org.jsoup.nodes.Element e) {
        boolean check = true;
        if (e == null) {
            check = false;
        }
        return check;
    }
}
