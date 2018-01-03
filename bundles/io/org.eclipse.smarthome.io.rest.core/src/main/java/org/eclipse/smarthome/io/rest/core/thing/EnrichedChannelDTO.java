/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.io.rest.core.thing;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.smarthome.core.thing.dto.ChannelDTO;

/**
 * This is a data transfer object that is used to serialize channels with dynamic data like linked items.
 *
 * @author Kai Kreuzer - Initial contribution
 *
 */
public class EnrichedChannelDTO extends ChannelDTO {

    final public Set<String> linkedItems;

    public EnrichedChannelDTO(ChannelDTO channelDTO, Set<String> linkedItems) {
        this.uid = channelDTO.uid;
        this.id = channelDTO.id;
        this.channelTypeUID = channelDTO.channelTypeUID;
        this.itemType = channelDTO.itemType;
        this.kind = channelDTO.kind;
        this.label = channelDTO.label;
        this.description = channelDTO.description;
        this.properties = channelDTO.properties;
        this.configuration = channelDTO.configuration;
        this.defaultTags = channelDTO.defaultTags;
        this.linkedItems = linkedItems != null ? new HashSet<>(linkedItems) : new HashSet<String>();
    }
}