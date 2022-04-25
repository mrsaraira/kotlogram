package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputPrivacyValueDisallowAll extends TLAbsInputPrivacyRule {
    public static final int CONSTRUCTOR_ID = 0xd66b66c9;

    private final String _constructor = "inputPrivacyValueDisallowAll#d66b66c9";

    public TLInputPrivacyValueDisallowAll() {
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
