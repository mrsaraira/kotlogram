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

public class TLPageListOrderedItemText extends TLAbsPageListOrderedItem {
    public static final int CONSTRUCTOR_ID = 0x5e068047;

    protected TLAbsRichText text;

    private final String _constructor = "pageListOrderedItemText#5e068047";

    public TLPageListOrderedItemText() {
    }

    public TLPageListOrderedItemText(String num, TLAbsRichText text) {
        this.num = num;
        this.text = text;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(num, stream);
        writeTLObject(text, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        num = readTLString(stream);
        text = readTLObject(stream, context, TLAbsRichText.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(num);
        size += text.computeSerializedSize();
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public TLAbsRichText getText() {
        return text;
    }

    public void setText(TLAbsRichText text) {
        this.text = text;
    }
}
