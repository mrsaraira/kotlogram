package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLPasswordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow}: passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow#3a912d4a</li>
 * <li>{@link TLPasswordKdfAlgoUnknown}: passwordKdfAlgoUnknown#d45ab096</li>
 * </ul>
 *
 */
public abstract class TLAbsPasswordKdfAlgo extends TLObject {
    public TLAbsPasswordKdfAlgo() {
    }
}
