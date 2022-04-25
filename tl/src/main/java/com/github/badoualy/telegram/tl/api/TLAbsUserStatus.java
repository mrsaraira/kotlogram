package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLUserStatusEmpty}: userStatusEmpty#9d05049</li>
 * <li>{@link TLUserStatusLastMonth}: userStatusLastMonth#77ebc742</li>
 * <li>{@link TLUserStatusLastWeek}: userStatusLastWeek#7bf09fc</li>
 * <li>{@link TLUserStatusOffline}: userStatusOffline#8c703f</li>
 * <li>{@link TLUserStatusOnline}: userStatusOnline#edb93949</li>
 * <li>{@link TLUserStatusRecently}: userStatusRecently#e26f42f1</li>
 * </ul>
 *
 */
public abstract class TLAbsUserStatus extends TLObject {
    public TLAbsUserStatus() {
    }
}
