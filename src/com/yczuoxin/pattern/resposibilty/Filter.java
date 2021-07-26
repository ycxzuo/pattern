package com.yczuoxin.pattern.resposibilty;

public interface Filter {

    void filter(Request request, Response response, FilterChain chain);

}
