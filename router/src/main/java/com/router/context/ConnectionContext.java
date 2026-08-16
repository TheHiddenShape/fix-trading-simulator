package com.router.context;

import java.nio.ByteBuffer;

public class ConnectionContext {

    private String id;
    private String clientLabel;
    private ByteBuffer buffer;

    public ConnectionContext() {
        this.buffer = ByteBuffer.allocate(1024);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setClientLabel(String clientLabel) {
        this.clientLabel = clientLabel;
    }

    public String getClientLabel() {
        return clientLabel;
    }

    public ByteBuffer getReadBuffer() {
        return buffer;
    }
}