package com.github.badoualy.telegram.tl.api.storage;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLFilePartial extends TLAbsFileType {
    public static final int CONSTRUCTOR_ID = 0x40bc6f52;

    private final String _constructor = "storage.filePartial#40bc6f52";

    public TLFilePartial() {
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
