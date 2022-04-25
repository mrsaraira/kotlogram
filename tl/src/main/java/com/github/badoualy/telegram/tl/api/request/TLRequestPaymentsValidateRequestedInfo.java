package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputPeer;
import com.github.badoualy.telegram.tl.api.TLPaymentRequestedInfo;
import com.github.badoualy.telegram.tl.api.payments.TLValidatedRequestedInfo;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestPaymentsValidateRequestedInfo extends TLMethod<TLValidatedRequestedInfo> {
    public static final int CONSTRUCTOR_ID = 0xdb103170;

    protected int flags;

    protected boolean save;

    protected TLAbsInputPeer peer;

    protected int msgId;

    protected TLPaymentRequestedInfo info;

    private final String _constructor = "payments.validateRequestedInfo#db103170";

    public TLRequestPaymentsValidateRequestedInfo() {
    }

    public TLRequestPaymentsValidateRequestedInfo(boolean save, TLAbsInputPeer peer, int msgId, TLPaymentRequestedInfo info) {
        this.save = save;
        this.peer = peer;
        this.msgId = msgId;
        this.info = info;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLValidatedRequestedInfo deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLValidatedRequestedInfo)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLValidatedRequestedInfo) response;
    }

    private void computeFlags() {
        flags = 0;
        flags = save ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(peer, stream);
        writeInt(msgId, stream);
        writeTLObject(info, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        save = (flags & 1) != 0;
        peer = readTLObject(stream, context, TLAbsInputPeer.class, -1);
        msgId = readInt(stream);
        info = readTLObject(stream, context, TLPaymentRequestedInfo.class, TLPaymentRequestedInfo.CONSTRUCTOR_ID);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += peer.computeSerializedSize();
        size += SIZE_INT32;
        size += info.computeSerializedSize();
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

    public boolean getSave() {
        return save;
    }

    public void setSave(boolean save) {
        this.save = save;
    }

    public TLAbsInputPeer getPeer() {
        return peer;
    }

    public void setPeer(TLAbsInputPeer peer) {
        this.peer = peer;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public TLPaymentRequestedInfo getInfo() {
        return info;
    }

    public void setInfo(TLPaymentRequestedInfo info) {
        this.info = info;
    }
}
