package sec01.verify.exam04;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;

		
		class Chat {
			void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
					break;
				}
				
			}
			
			void sendMessage(String message) {
				System.out.println(message);
			}
		}
		
		Chat chat = new Chat();
		chat.start();
	}
}
