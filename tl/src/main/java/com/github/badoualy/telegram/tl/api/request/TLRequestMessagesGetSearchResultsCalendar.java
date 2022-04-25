package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputPeer;
import com.github.badoualy.telegram.tl.api.TLAbsMessagesFilter;
import com.github.badoualy.telegram.tl.api.messages.TLSearchResultsCalendar;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestMessagesGetSearchResultsCalendar extends TLMethod<TLSearchResultsCalendar> {
    public static final int CONSTRUCTOR_ID = 0x49f0bde9;

    protected TLAbsInputPeer peer;

    protected TLAbsMessagesFilter filter;

    protected int offsetId;

    protected int offsetDate;

    private final String _constructor = "messages.getSearchResultsCalendar#49f0bde9";

    public TLRequestMessagesGetSearchResultsCalendar() {
    }

    public TLRequestMessagesGetSearchResultsCalendar(TLAbsInputPeer peer, TLAbsMessagesFilter filter, int offsetId, int offsetDate) {
        this.peer = peer;
        this.filter = filter;
        this.offsetId = offsetId;
        this.offsetDate = offsetDate;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLSearchResultsCalendar deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLSearchResultsCalendar)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLSearchResultsCalendar) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(peer, stream);
        writeTLObject(filter, stream);
        writeInt(offsetId, stream);
        writeInt(offsetDate, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        peer = readTLObject(stream, context, TLAbsInputPeer.class, -1);
        filter = readTLObject(stream, context, TLAbsMessagesFilter.class, -1);
        offsetId = readInt(stream);
        offsetDate = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += peer.computeSerializedSize();
        size += filter.computeSerializedSize();
        size += SIZE_INT32;
        size += SIZE_INT32;
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

    public TLAbsMessagesFilter getFilter() {
        return filter;
    }

    public void setFilter(TLAbsMessagesFilter filter) {
        this.filter = filter;
    }

    public int getOffsetId() {
        return offsetId;
    }

    public void setOffsetId(int offsetId) {
        this.offsetId = offsetId;
    }

    public int getOffsetDate() {
        return offsetDate;
    }

    public void setOffsetDate(int offsetDate) {
        this.offsetDate = offsetDate;
    }
}
