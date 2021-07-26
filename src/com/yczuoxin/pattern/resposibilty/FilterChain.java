package com.yczuoxin.pattern.resposibilty;

public interface FilterChain {

    void doFilter(Request request, Response response);

}
