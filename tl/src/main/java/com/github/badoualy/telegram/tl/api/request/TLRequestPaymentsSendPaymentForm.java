package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputPaymentCredentials;
import com.github.badoualy.telegram.tl.api.TLAbsInputPeer;
import com.github.badoualy.telegram.tl.api.payments.TLAbsPaymentResult;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestPaymentsSendPaymentForm extends TLMethod<TLAbsPaymentResult> {
    public static final int CONSTRUCTOR_ID = 0x30c3bc9d;

    protected int flags;

    protected long formId;

    protected TLAbsInputPeer peer;

    protected int msgId;

    protected String requestedInfoId;

    protected String shippingOptionId;

    protected TLAbsInputPaymentCredentials credentials;

    protected Long tipAmount;

    private final String _constructor = "payments.sendPaymentForm#30c3bc9d";

    public TLRequestPaymentsSendPaymentForm() {
    }

    public TLRequestPaymentsSendPaymentForm(long formId, TLAbsInputPeer peer, int msgId, String requestedInfoId, String shippingOptionId, TLAbsInputPaymentCredentials credentials, Long tipAmount) {
        this.formId = formId;
        this.peer = peer;
        this.msgId = msgId;
        this.requestedInfoId = requestedInfoId;
        this.shippingOptionId = shippingOptionId;
        this.credentials = credentials;
        this.tipAmount = tipAmount;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLAbsPaymentResult deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLAbsPaymentResult)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLAbsPaymentResult) response;
    }

    private void computeFlags() {
        flags = 0;
        flags = requestedInfoId != null ? (flags | 1) : (flags & ~1);
        flags = shippingOptionId != null ? (flags | 2) : (flags & ~2);
        flags = tipAmount != null ? (flags | 4) : (flags & ~4);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeLong(formId, stream);
        writeTLObject(peer, stream);
        writeInt(msgId, stream);
        if ((flags & 1) != 0) {
            if (requestedInfoId == null) throwNullFieldException("requestedInfoId", flags);
            writeString(requestedInfoId, stream);
        }
        if ((flags & 2) != 0) {
            if (shippingOptionId == null) throwNullFieldException("shippingOptionId", flags);
            writeString(shippingOptionId, stream);
        }
        writeTLObject(credentials, stream);
        if ((flags & 4) != 0) {
            if (tipAmount == null) throwNullFieldException("tipAmount", flags);
            writeLong(tipAmount, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        formId = readLong(stream);
        peer = readTLObject(stream, context, TLAbsInputPeer.class, -1);
        msgId = readInt(stream);
        requestedInfoId = (flags & 1) != 0 ? readTLString(stream) : null;
        shippingOptionId = (flags & 2) != 0 ? readTLString(stream) : null;
        credentials = readTLObject(stream, context, TLAbsInputPaymentCredentials.class, -1);
        tipAmount = (flags & 4) != 0 ? readLong(stream) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT64;
        size += peer.computeSerializedSize();
        size += SIZE_INT32;
        if ((flags & 1) != 0) {
            if (requestedInfoId == null) throwNullFieldException("requestedInfoId", flags);
            size += computeTLStringSerializedSize(requestedInfoId);
        }
        if ((flags & 2) != 0) {
            if (shippingOptionId == null) throwNullFieldException("shippingOptionId", flags);
            size += computeTLStringSerializedSize(shippingOptionId);
        }
        size += credentials.computeSerializedSize();
        if ((flags & 4) != 0) {
            if (tipAmount == null) throwNullFieldException("tipAmount", flags);
            size += SIZE_INT64;
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

    public long getFormId() {
        return formId;
    }

    public void setFormId(long formId) {
        this.formId = formId;
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

    public String getRequestedInfoId() {
        return requestedInfoId;
    }

    public void setRequestedInfoId(String requestedInfoId) {
        this.requestedInfoId = requestedInfoId;
    }

    public String getShippingOptionId() {
        return shippingOptionId;
    }

    public void setShippingOptionId(String shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
    }

    public TLAbsInputPaymentCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(TLAbsInputPaymentCredentials credentials) {
        this.credentials = credentials;
    }

    public Long getTipAmount() {
        return tipAmount;
    }

    public void setTipAmount(Long tipAmount) {
        this.tipAmount = tipAmount;
    }
}
