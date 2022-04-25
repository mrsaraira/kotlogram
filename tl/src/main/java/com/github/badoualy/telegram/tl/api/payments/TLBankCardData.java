package com.github.badoualy.telegram.tl.api.payments;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLBankCardOpenUrl;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLBankCardData extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x3e24e573;

    protected String title;

    protected TLVector<TLBankCardOpenUrl> openUrls;

    private final String _constructor = "payments.bankCardData#3e24e573";

    public TLBankCardData() {
    }

    public TLBankCardData(String title, TLVector<TLBankCardOpenUrl> openUrls) {
        this.title = title;
        this.openUrls = openUrls;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(title, stream);
        writeTLVector(openUrls, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        title = readTLString(stream);
        openUrls = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(title);
        size += openUrls.computeSerializedSize();
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

    public TLVector<TLBankCardOpenUrl> getOpenUrls() {
        return openUrls;
    }

    public void setOpenUrls(TLVector<TLBankCardOpenUrl> openUrls) {
        this.openUrls = openUrls;
    }
}
