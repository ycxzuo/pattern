package com.yczuoxin.pattern.resposibilty;

public class MessageFilter implements Filter {
    @Override
    public void filter(Request request, Response response, FilterChain chain) {
        request.str += " -> message request ";
        chain.doFilter(request, response);
        response.str += " -> message response ";
    }
}
