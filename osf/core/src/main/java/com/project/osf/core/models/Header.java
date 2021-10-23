package com.project.osf.core.models;

import com.project.osf.core.models.classes.Links;
import org.apache.sling.api.resource.Resource;

import java.util.List;

public interface Header {

    List<Links> getLinks(Resource resource);
}
