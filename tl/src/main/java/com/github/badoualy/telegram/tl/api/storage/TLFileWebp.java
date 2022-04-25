package com.github.badoualy.telegram.tl.api.storage;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLFileWebp extends TLAbsFileType {
    public static final int CONSTRUCTOR_ID = 0x1081464c;

    private final String _constructor = "storage.fileWebp#1081464c";

    public TLFileWebp() {
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
