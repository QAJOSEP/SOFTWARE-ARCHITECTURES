package com.josepillado.arquitecturasmodernas.cqrs.eventsourcing.command.event.post;

import com.josepillado.arquitecturasmodernas.cqrs.eventsourcing.command.event.Event;

public class PostRemovedEvent extends Event {

  private String postId;

  public String getPostId() {
    return postId;
  }

  public void setPostId(String postId) {
    this.postId = postId;
  }
}
