package javabrains.springboot.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopiController {

	@Autowired
	private TopicsService topicsService;
	
	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return topicsService.getAllTopics();
	}
	
	@RequestMapping("/topic/{id}")
	public Topics getTopicById(@PathVariable("id") int id) {
		return topicsService.getTopicById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topic")
	public String addTopic(@RequestBody Topics topic) {
		System.out.println(topic);
		topicsService.addTopic(topic);
		return "success";
	}
}
