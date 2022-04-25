package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputPrivacyValueAllowAll extends TLAbsInputPrivacyRule {
    public static final int CONSTRUCTOR_ID = 0x184b35ce;

    private final String _constructor = "inputPrivacyValueAllowAll#184b35ce";

    public TLInputPrivacyValueAllowAll() {
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
