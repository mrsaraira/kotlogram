package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLLongVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLUpdatePendingJoinRequests extends TLAbsUpdate {
    public static final int CONSTRUCTOR_ID = 0x7063c3db;

    protected TLAbsPeer peer;

    protected int requestsPending;

    protected TLLongVector recentRequesters;

    private final String _constructor = "updatePendingJoinRequests#7063c3db";

    public TLUpdatePendingJoinRequests() {
    }

    public TLUpdatePendingJoinRequests(TLAbsPeer peer, int requestsPending, TLLongVector recentRequesters) {
        this.peer = peer;
        this.requestsPending = requestsPending;
        this.recentRequesters = recentRequesters;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(peer, stream);
        writeInt(requestsPending, stream);
        writeTLVector(recentRequesters, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        peer = readTLObject(stream, context, TLAbsPeer.class, -1);
        requestsPending = readInt(stream);
        recentRequesters = readTLLongVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += peer.computeSerializedSize();
        size += SIZE_INT32;
        size += recentRequesters.computeSerializedSize();
        return size;
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }

    public TLAbsPeer getPeer() {
        return peer;
    }

    public void setPeer(TLAbsPeer peer) {
        this.peer = peer;
    }

    public int getRequestsPending() {
        return requestsPending;
    }

    public void setRequestsPending(int requestsPending) {
        this.requestsPending = requestsPending;
    }

    public TLLongVector getRecentRequesters() {
        return recentRequesters;
    }

    public void setRecentRequesters(TLLongVector recentRequesters) {
        this.recentRequesters = recentRequesters;
    }
}
