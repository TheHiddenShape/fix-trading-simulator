package com.router;

import com.router.server.RouterServer;

public class Main {
    public static void main(String[] args) throws Exception {
        RouterServer router = new RouterServer(5001, 5000);
        router.runEventLoop();
    }
}