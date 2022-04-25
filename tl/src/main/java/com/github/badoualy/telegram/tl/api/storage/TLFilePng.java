package com.github.badoualy.telegram.tl.api.storage;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLFilePng extends TLAbsFileType {
    public static final int CONSTRUCTOR_ID = 0xa4f63c0;

    private final String _constructor = "storage.filePng#a4f63c0";

    public TLFilePng() {
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }
}
