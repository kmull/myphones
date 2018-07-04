package com.muller.mojeTelefony.navigation;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navig", eager = true)
@RequestScoped
public class NavigationBean {
    private final String errorMessage = "Not Found";
    Logger log = LoggerFactory.getLogger(NavigationBean.class);

    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    public String showPage() {

//        log.info("showPage started, option: " + pageId);
//        if (pageId == null) {
//            log.info("showPage: " + errorMessage);
//            return "index";
//        } else if (pageId.equals("1")) {
//            return "addUser";
//        } else if (pageId.equals("2")) {
//            return "getUser";
//        } else if (pageId.equals("3")) {
//            return "findUser";
//        } else {
//            return "index";
//        }
//        return check;
        String check = "index";
        if (pageId == null) {
//            log.info("showPage: " + errorMessage);
            check = errorMessage;
        } else if (pageId.equals("1")) {
            check = "addUser";
        } else if (pageId.equals("2")) {
            check = "getUser";
        } else if (pageId.equals("3")) {
            check = "findUser";
        } else {
            check = "index";
        }
        log.info("showPage started, option: " + check);
        return check;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
}
