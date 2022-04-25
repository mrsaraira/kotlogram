package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLDocumentAttributeAnimated extends TLAbsDocumentAttribute {
    public static final int CONSTRUCTOR_ID = 0x11b58939;

    private final String _constructor = "documentAttributeAnimated#11b58939";

    public TLDocumentAttributeAnimated() {
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
