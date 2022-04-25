package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputPeer;
import com.github.badoualy.telegram.tl.api.messages.TLAbsTranslatedText;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestMessagesTranslateText extends TLMethod<TLAbsTranslatedText> {
    public static final int CONSTRUCTOR_ID = 0x24ce6dee;

    protected int flags;

    protected TLAbsInputPeer peer;

    protected Integer msgId;

    protected String text;

    protected String fromLang;

    protected String toLang;

    private final String _constructor = "messages.translateText#24ce6dee";

    public TLRequestMessagesTranslateText() {
    }

    public TLRequestMessagesTranslateText(TLAbsInputPeer peer, Integer msgId, String text, String fromLang, String toLang) {
        this.peer = peer;
        this.msgId = msgId;
        this.text = text;
        this.fromLang = fromLang;
        this.toLang = toLang;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLAbsTranslatedText deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLAbsTranslatedText)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLAbsTranslatedText) response;
    }

    private void computeFlags() {
        flags = 0;
        flags = peer != null ? (flags | 1) : (flags & ~1);
        flags = msgId != null ? (flags | 1) : (flags & ~1);
        flags = text != null ? (flags | 2) : (flags & ~2);
        flags = fromLang != null ? (flags | 4) : (flags & ~4);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        if ((flags & 1) != 0) {
            if (peer == null) throwNullFieldException("peer", flags);
            writeTLObject(peer, stream);
        }
        if ((flags & 1) != 0) {
            if (msgId == null) throwNullFieldException("msgId", flags);
            writeInt(msgId, stream);
        }
        if ((flags & 2) != 0) {
            if (text == null) throwNullFieldException("text", flags);
            writeString(text, stream);
        }
        if ((flags & 4) != 0) {
            if (fromLang == null) throwNullFieldException("fromLang", flags);
            writeString(fromLang, stream);
        }
        writeString(toLang, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        peer = (flags & 1) != 0 ? readTLObject(stream, context, TLAbsInputPeer.class, -1) : null;
        msgId = (flags & 1) != 0 ? readInt(stream) : null;
        text = (flags & 2) != 0 ? readTLString(stream) : null;
        fromLang = (flags & 4) != 0 ? readTLString(stream) : null;
        toLang = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        if ((flags & 1) != 0) {
            if (peer == null) throwNullFieldException("peer", flags);
            size += peer.computeSerializedSize();
        }
        if ((flags & 1) != 0) {
            if (msgId == null) throwNullFieldException("msgId", flags);
            size += SIZE_INT32;
        }
        if ((flags & 2) != 0) {
            if (text == null) throwNullFieldException("text", flags);
            size += computeTLStringSerializedSize(text);
        }
        if ((flags & 4) != 0) {
            if (fromLang == null) throwNullFieldException("fromLang", flags);
            size += computeTLStringSerializedSize(fromLang);
        }
        size += computeTLStringSerializedSize(toLang);
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

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFromLang() {
        return fromLang;
    }

    public void setFromLang(String fromLang) {
        this.fromLang = fromLang;
    }

    public String getToLang() {
        return toLang;
    }

    public void setToLang(String toLang) {
        this.toLang = toLang;
    }
}
