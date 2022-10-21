package com.solo.SoloProject.mapper;

import com.solo.SoloProject.ToDoDto.TodoDto;
import com.solo.SoloProject.entity.Todo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-18T13:11:31+0900",
    comments = "version: 1.5.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.3 (Azul Systems, Inc.)"
)
@Component
public class TodoMapperImpl implements TodoMapper {

    @Override
    public Todo todoPostToTodo(TodoDto.Post post) {
        if ( post == null ) {
            return null;
        }

        Todo todo = new Todo();

        todo.setTitle( post.getTitle() );
        todo.setOrder( post.getOrder() );
        todo.setCompleted( post.isCompleted() );

        return todo;
    }

    @Override
    public Todo todoPatchToTodo(TodoDto.Patch patch) {
        if ( patch == null ) {
            return null;
        }

        Todo todo = new Todo();

        todo.setTitle( patch.getTitle() );
        todo.setOrder( patch.getOrder() );
        todo.setCompleted( patch.isCompleted() );

        return todo;
    }

    @Override
    public TodoDto.Response todoToTodoResponse(Todo todo) {
        if ( todo == null ) {
            return null;
        }

        Long id = null;
        String title = null;
        int order = 0;
        boolean completed = false;

        id = todo.getId();
        title = todo.getTitle();
        order = todo.getOrder();
        completed = todo.isCompleted();

        TodoDto.Response response = new TodoDto.Response( id, title, order, completed );

        return response;
    }

    @Override
    public List<TodoDto.Response> todosToTodoResponses(List<Todo> todos) {
        if ( todos == null ) {
            return null;
        }

        List<TodoDto.Response> list = new ArrayList<TodoDto.Response>( todos.size() );
        for ( Todo todo : todos ) {
            list.add( todoToTodoResponse( todo ) );
        }

        return list;
    }
}
