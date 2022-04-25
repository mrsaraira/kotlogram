package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLEmojiLanguage;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLStringVector;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestMessagesGetEmojiKeywordsLanguages extends TLMethod<TLVector<TLEmojiLanguage>> {
    public static final int CONSTRUCTOR_ID = 0x4e9963b2;

    protected TLStringVector langCodes;

    private final String _constructor = "messages.getEmojiKeywordsLanguages#4e9963b2";

    public TLRequestMessagesGetEmojiKeywordsLanguages() {
    }

    public TLRequestMessagesGetEmojiKeywordsLanguages(TLStringVector langCodes) {
        this.langCodes = langCodes;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLVector<TLEmojiLanguage> deserializeResponse(InputStream stream, TLContext context) throws IOException {
        return readTLVector(stream, context);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(langCodes, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        langCodes = readTLStringVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += langCodes.computeSerializedSize();
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

    public TLStringVector getLangCodes() {
        return langCodes;
    }

    public void setLangCodes(TLStringVector langCodes) {
        this.langCodes = langCodes;
    }
}
