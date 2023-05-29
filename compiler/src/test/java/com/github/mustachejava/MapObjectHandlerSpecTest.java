package com.github.mustachejava;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.mustachejava.reflect.MapObjectHandler;
import com.github.mustachejava.reflect.SimpleObjectHandler;
import org.junit.Test;

public class MapObjectHandlerSpecTest extends SpecTest {

  @Override
  @Test
  public void lambdas() {
    // MapObjectHandler does not support lambdas as that would require looking up the value of
    // object methods in the Map.
  }

  @Override
  protected DefaultMustacheFactory createMustacheFactory(JsonNode test) {
    DefaultMustacheFactory mf = super.createMustacheFactory(test);
    mf.setObjectHandler(new MapObjectHandler());
    return mf;
  }
}
