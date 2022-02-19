package org.acme

import javax.inject.Inject
import javax.enterprise.inject.Default

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class ReactiveGreetingResource {

    @Inject
    @field: Default 
    lateinit var service: GreetingService

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    fun greeting(@PathParam("name") name: String): String {
        return service.greeting(name)
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    suspend fun hello() = "Hello RESTEasy Reactive by Kotlin Suspend function"
}