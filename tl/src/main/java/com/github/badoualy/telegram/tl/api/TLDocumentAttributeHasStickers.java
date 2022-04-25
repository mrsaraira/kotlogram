package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLDocumentAttributeHasStickers extends TLAbsDocumentAttribute {
    public static final int CONSTRUCTOR_ID = 0x9801d2f7;

    private final String _constructor = "documentAttributeHasStickers#9801d2f7";

    public TLDocumentAttributeHasStickers() {
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
