package com.elcanto.mockito.TestMockitoMVC;

//@RunWith(SpringJUnit4ClassRunner.class)
public class HelloControllerTest {
/*
    private MockMvc mockMvc;

    @Mock
    private HelloService helloService;

    @InjectMocks
    private HelloController helloController;

    @Before
    public void setUp() throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();
    }

    @Test
     public void testHelloWoString() throws  Exception{

        when(helloService.hello()).thenReturn("hello");

        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello"));

        verify(helloService).hello();
    }

    @Test
    public void testHelloJsonGET() throws  Exception{
        mockMvc.perform(get("/hello/json")
                .accept(APPLICATION_JSON))
                .andExpect(jsonPath("$.title", is("adr")))
                .andExpect(jsonPath("$.value", is("can")))
                .andExpect(jsonPath("$.*",hasSize(2)));
    }

    @Test
    public void testHelloJsonPost() throws  Exception{
        String json = "{\n" +
                "  \"title\": \"adr\",\n" +
                "  \"value\": \"can\"\n" +
                "}";
        mockMvc.perform(post("/hello/json")
                .contentType(APPLICATION_JSON)
                .content(json)
                .accept(APPLICATION_JSON))
                .andExpect(jsonPath("$.title", is("adr")))
                .andExpect(jsonPath("$.value", is("can")))
                .andExpect(jsonPath("$.*",hasSize(2)));
    }
    */
}