package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputPeer;
import com.github.badoualy.telegram.tl.api.TLDataJSON;
import com.github.badoualy.telegram.tl.api.payments.TLPaymentForm;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestPaymentsGetPaymentForm extends TLMethod<TLPaymentForm> {
    public static final int CONSTRUCTOR_ID = 0x8a333c8d;

    protected int flags;

    protected TLAbsInputPeer peer;

    protected int msgId;

    protected TLDataJSON themeParams;

    private final String _constructor = "payments.getPaymentForm#8a333c8d";

    public TLRequestPaymentsGetPaymentForm() {
    }

    public TLRequestPaymentsGetPaymentForm(TLAbsInputPeer peer, int msgId, TLDataJSON themeParams) {
        this.peer = peer;
        this.msgId = msgId;
        this.themeParams = themeParams;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLPaymentForm deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLPaymentForm)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLPaymentForm) response;
    }

    private void computeFlags() {
        flags = 0;
        flags = themeParams != null ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(peer, stream);
        writeInt(msgId, stream);
        if ((flags & 1) != 0) {
            if (themeParams == null) throwNullFieldException("themeParams", flags);
            writeTLObject(themeParams, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        peer = readTLObject(stream, context, TLAbsInputPeer.class, -1);
        msgId = readInt(stream);
        themeParams = (flags & 1) != 0 ? readTLObject(stream, context, TLDataJSON.class, TLDataJSON.CONSTRUCTOR_ID) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += peer.computeSerializedSize();
        size += SIZE_INT32;
        if ((flags & 1) != 0) {
            if (themeParams == null) throwNullFieldException("themeParams", flags);
            size += themeParams.computeSerializedSize();
        }
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

    public TLDataJSON getThemeParams() {
        return themeParams;
    }

    public void setThemeParams(TLDataJSON themeParams) {
        this.themeParams = themeParams;
    }
}
