package com.github.badoualy.telegram.tl.api.channels;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChannelParticipants}: channels.channelParticipants#9ab0feaf</li>
 * <li>{@link TLChannelParticipantsNotModified}: channels.channelParticipantsNotModified#f0173fe9</li>
 * </ul>
 *
 */
public abstract class TLAbsChannelParticipants extends TLObject {
    public TLAbsChannelParticipants() {
    }
}
