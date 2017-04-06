package com.czy.dubbox.service;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.czy.dubbox.entity.User;

import javax.ws.rs.*;
import java.awt.*;

@Path("/userService")
//@Consumes({PageAttributes.MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface UserService {
	@GET
    @Path("/testget")
	public void testget();
    @GET
    @Path("/getUser")
	public User getUser();
	@GET
	@Path("/get/{id : \\d+}")
	public User getUser(@PathParam(value = "id") Integer id);
	@GET
	@Path("/get/{id : \\d+}/{name : [a-zA-Z][0-9]}")
	public User getUser(@PathParam(value = "id") Integer id, @PathParam(value = "name") String name);
    @POST
    @Path("/testpost")
	public void testpost();
    @POST
    @Path("/postUser")
	public User postUser(User user);
	@POST
	@Path("/post/{id}")
	public User postUser(@PathParam(value = "id") String id);

}
