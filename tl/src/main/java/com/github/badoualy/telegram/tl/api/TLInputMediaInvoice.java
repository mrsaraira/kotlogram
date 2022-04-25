package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLInputMediaInvoice extends TLAbsInputMedia {
    public static final int CONSTRUCTOR_ID = 0xd9799874;

    protected int flags;

    protected String title;

    protected String description;

    protected TLInputWebDocument photo;

    protected TLInvoice invoice;

    protected TLBytes payload;

    protected String provider;

    protected TLDataJSON providerData;

    protected String startParam;

    private final String _constructor = "inputMediaInvoice#d9799874";

    public TLInputMediaInvoice() {
    }

    public TLInputMediaInvoice(String title, String description, TLInputWebDocument photo, TLInvoice invoice, TLBytes payload, String provider, TLDataJSON providerData, String startParam) {
        this.title = title;
        this.description = description;
        this.photo = photo;
        this.invoice = invoice;
        this.payload = payload;
        this.provider = provider;
        this.providerData = providerData;
        this.startParam = startParam;
    }

    private void computeFlags() {
        flags = 0;
        flags = photo != null ? (flags | 1) : (flags & ~1);
        flags = startParam != null ? (flags | 2) : (flags & ~2);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeString(title, stream);
        writeString(description, stream);
        if ((flags & 1) != 0) {
            if (photo == null) throwNullFieldException("photo", flags);
            writeTLObject(photo, stream);
        }
        writeTLObject(invoice, stream);
        writeTLBytes(payload, stream);
        writeString(provider, stream);
        writeTLObject(providerData, stream);
        if ((flags & 2) != 0) {
            if (startParam == null) throwNullFieldException("startParam", flags);
            writeString(startParam, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        title = readTLString(stream);
        description = readTLString(stream);
        photo = (flags & 1) != 0 ? readTLObject(stream, context, TLInputWebDocument.class, TLInputWebDocument.CONSTRUCTOR_ID) : null;
        invoice = readTLObject(stream, context, TLInvoice.class, TLInvoice.CONSTRUCTOR_ID);
        payload = readTLBytes(stream, context);
        provider = readTLString(stream);
        providerData = readTLObject(stream, context, TLDataJSON.class, TLDataJSON.CONSTRUCTOR_ID);
        startParam = (flags & 2) != 0 ? readTLString(stream) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += computeTLStringSerializedSize(title);
        size += computeTLStringSerializedSize(description);
        if ((flags & 1) != 0) {
            if (photo == null) throwNullFieldException("photo", flags);
            size += photo.computeSerializedSize();
        }
        size += invoice.computeSerializedSize();
        size += computeTLBytesSerializedSize(payload);
        size += computeTLStringSerializedSize(provider);
        size += providerData.computeSerializedSize();
        if ((flags & 2) != 0) {
            if (startParam == null) throwNullFieldException("startParam", flags);
            size += computeTLStringSerializedSize(startParam);
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TLInputWebDocument getPhoto() {
        return photo;
    }

    public void setPhoto(TLInputWebDocument photo) {
        this.photo = photo;
    }

    public TLInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(TLInvoice invoice) {
        this.invoice = invoice;
    }

    public TLBytes getPayload() {
        return payload;
    }

    public void setPayload(TLBytes payload) {
        this.payload = payload;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public TLDataJSON getProviderData() {
        return providerData;
    }

    public void setProviderData(TLDataJSON providerData) {
        this.providerData = providerData;
    }

    public String getStartParam() {
        return startParam;
    }

    public void setStartParam(String startParam) {
        this.startParam = startParam;
    }
}
