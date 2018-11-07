package com.dyn.filter;

import com.google.gson.JsonObject;

public class filterTest implements Filter {

  @Override
  // If I use String as input instead of JsonObject there is no error
  public String exec(JsonObject input) {
    if (input.has("a")) {
      String tmp = "______FILTERED_____";
      return tmp;
    }
    return "__NOK__";
  }
}
