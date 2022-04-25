package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLUpdatePeerBlocked extends TLAbsUpdate {
    public static final int CONSTRUCTOR_ID = 0x246a4b22;

    protected TLAbsPeer peerId;

    protected boolean blocked;

    private final String _constructor = "updatePeerBlocked#246a4b22";

    public TLUpdatePeerBlocked() {
    }

    public TLUpdatePeerBlocked(TLAbsPeer peerId, boolean blocked) {
        this.peerId = peerId;
        this.blocked = blocked;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(peerId, stream);
        writeBoolean(blocked, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        peerId = readTLObject(stream, context, TLAbsPeer.class, -1);
        blocked = readTLBool(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += peerId.computeSerializedSize();
        size += SIZE_BOOLEAN;
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

    public TLAbsPeer getPeerId() {
        return peerId;
    }

    public void setPeerId(TLAbsPeer peerId) {
        this.peerId = peerId;
    }

    public boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
