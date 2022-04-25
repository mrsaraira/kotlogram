package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLUpdatePeerLocated extends TLAbsUpdate {
    public static final int CONSTRUCTOR_ID = 0xb4afcfb0;

    protected TLVector<TLAbsPeerLocated> peers;

    private final String _constructor = "updatePeerLocated#b4afcfb0";

    public TLUpdatePeerLocated() {
    }

    public TLUpdatePeerLocated(TLVector<TLAbsPeerLocated> peers) {
        this.peers = peers;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(peers, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        peers = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += peers.computeSerializedSize();
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

    public TLVector<TLAbsPeerLocated> getPeers() {
        return peers;
    }

    public void setPeers(TLVector<TLAbsPeerLocated> peers) {
        this.peers = peers;
    }
}
