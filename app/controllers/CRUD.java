package controllers;

import play.mvc.Result;

public interface CRUD {

    Result create();
    Result read();
    Result update(String id);
    Result delete(String id);
    Result form();
}
