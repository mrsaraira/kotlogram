package com.github.badoualy.telegram.tl.api.phone;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLExportedGroupCallInvite extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x204bd158;

    protected String link;

    private final String _constructor = "phone.exportedGroupCallInvite#204bd158";

    public TLExportedGroupCallInvite() {
    }

    public TLExportedGroupCallInvite(String link) {
        this.link = link;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(link, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        link = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(link);
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
