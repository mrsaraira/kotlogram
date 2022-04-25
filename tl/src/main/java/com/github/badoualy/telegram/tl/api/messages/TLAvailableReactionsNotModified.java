package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLAvailableReactionsNotModified extends TLAbsAvailableReactions {
    public static final int CONSTRUCTOR_ID = 0x9f071957;

    private final String _constructor = "messages.availableReactionsNotModified#9f071957";

    public TLAvailableReactionsNotModified() {
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
