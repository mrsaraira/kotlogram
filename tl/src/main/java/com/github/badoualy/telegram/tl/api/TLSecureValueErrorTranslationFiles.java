package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLBytes;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLSecureValueErrorTranslationFiles extends TLAbsSecureValueError {
    public static final int CONSTRUCTOR_ID = 0x34636dd8;

    protected TLVector<TLBytes> fileHash;

    private final String _constructor = "secureValueErrorTranslationFiles#34636dd8";

    public TLSecureValueErrorTranslationFiles() {
    }

    public TLSecureValueErrorTranslationFiles(TLAbsSecureValueType type, TLVector<TLBytes> fileHash, String text) {
        this.type = type;
        this.fileHash = fileHash;
        this.text = text;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(type, stream);
        writeTLVector(fileHash, stream);
        writeString(text, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        type = readTLObject(stream, context, TLAbsSecureValueType.class, -1);
        fileHash = readTLVector(stream, context);
        text = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += type.computeSerializedSize();
        size += fileHash.computeSerializedSize();
        size += computeTLStringSerializedSize(text);
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

    public TLAbsSecureValueType getType() {
        return type;
    }

    public void setType(TLAbsSecureValueType type) {
        this.type = type;
    }

    public TLVector<TLBytes> getFileHash() {
        return fileHash;
    }

    public void setFileHash(TLVector<TLBytes> fileHash) {
        this.fileHash = fileHash;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
