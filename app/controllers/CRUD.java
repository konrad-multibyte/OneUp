package controllers;

import play.mvc.Result;

public interface CRUD {

    Result create();
    Result read();
    Result update(int id);
    Result delete(int id);
    Result form();
}
