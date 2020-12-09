@SpringBootApplication

Both @RestController and @Controller handle http-requests and allow you to bind java-methods to different requests 
from different URI's using the @RequestMapping annotation. 

This project will eventually switch the use of @RequestMapping to the request-specific
annotations, @GetMapping, @PostMapping, @DeleteMapping and @PutMapping.

@Service is a further abstraction of the Controller and is composed with the Controller using
@Autowired. 

@RequestBody parses the body of the http-request to a java-object.

1. A http-Get-request for localhost:8080/messages from the browser goes to 
MessageController because this class has the @RequestMapping annotation with this
URL as the argument.
2. The method getAllMessages is called.
3. MessageController is @AutoWired to MessageService which allows getAllMessages to
call messageService.getAllMessages which returns <List>Message messages.
4. The return value, the list of Message objects, is parsed to JSON because of the
@RestController annotation and is then displayed by the browser.

A http-Post-request to localhost:8080/messages will be handled by the addMessage method.
The method takes the body of the http-Post-request as an argument and parses this to
a Message object. The method then calls messageService.addMessage which adds the object
the <List>messages.

