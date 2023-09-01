package com.maping.newmany.to.manymaping;

import com.maping.newmany.to.manymaping.entity.Post;
import com.maping.newmany.to.manymaping.entity.Tag;
import com.maping.newmany.to.manymaping.repository.PostRepository;
import com.maping.newmany.to.manymaping.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewManyToManyMapingApplication implements CommandLineRunner {
     @Autowired
	 private PostRepository postRepository;

	 @Autowired

	public static void main(String[] args) {
		SpringApplication.run(NewManyToManyMapingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Post post=new Post("Hibernet many to many maping","hibernet many to many maping example in springboot","yes its run");

		Tag tag=new Tag("springboot");
		Tag tag1=new Tag("hibernet");
		post.getTags().add(tag);
		post.getTags().add(tag1);

		tag.getPosts().add(post);
		tag1.getPosts().add(post);

		this.postRepository.save(post);


	}
}
