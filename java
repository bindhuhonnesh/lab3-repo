import com.openai.OpenAiApi;
import com.openai.OpenAiService;
import com.openai.api.models.ChatCompletionRequest;
import com.openai.api.models.ChatCompletionResponse;
import com.openai.api.models.ChatMessage;

import java.util.List;

public class ChatGPTExample {
    public static void main(String[] args) {
        String apiKey = "YOUR_API_KEY";
        OpenAiService service = new OpenAiService(apiKey);

        ChatCompletionRequest request = ChatCompletionRequest.builder()
            .model("gpt-3.5-turbo")
            .messages(List.of(new ChatMessage("user", "Hello, how are you?")))
            .build();

        ChatCompletionResponse response = service.createChatCompletion(request);
        System.out.println(response.getChoices().get(0).getMessage().getContent());
    }
}
