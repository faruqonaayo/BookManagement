package services;

import models.*;

public class BookService {
	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		if (author == null || books == null) {
			return new Book[0];
		}

		int currentIndex = 0;
		Book[] filteredBooks = new Book[books.length];
		for (Book book : books) {
			for (Author auth : book.getAuthors()) {
				if (auth.getId() == author.getId()) {
					filteredBooks[currentIndex++] = book;
				}
			}
		}

		int startNull = -1;

		for (int i = 0; i < filteredBooks.length; i++) {
			if (filteredBooks[i] == null) {
				break;
			}
			startNull = i;
		}

		Book[] cleanFilter = new Book[startNull + 1];

		if (cleanFilter.length > 0) {
			for (int i = 0; i < cleanFilter.length; i++) {
				cleanFilter[i] = filteredBooks[i];

			}
		}

		return cleanFilter;

	}

	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		if (publisher == null || books == null) {
			return new Book[0];
		}

		int currentIndex = 0;
		Book[] filteredBooks = new Book[books.length];
		for (Book book : books) {

			if (publisher.getId() == book.getPublisher().getId()) {
				filteredBooks[currentIndex++] = book;
			}
		}

		int startNull = -1;

		for (int i = 0; i < filteredBooks.length; i++) {
			if (filteredBooks[i] == null) {
				break;
			}
			startNull = i;
		}

		Book[] cleanFilter = new Book[startNull + 1];

		if (cleanFilter.length > 0) {
			for (int i = 0; i < cleanFilter.length; i++) {
				cleanFilter[i] = filteredBooks[i];

			}
		}

		return cleanFilter;
	}

	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		if (books == null) {
			return new Book[0];
		}
		int currentIndex = 0;
		Book[] filteredBooks = new Book[books.length];
		for (Book book : books) {

			if (book.getPublishingYear() >= yearFromInclusively) {
				filteredBooks[currentIndex++] = book;
			}
		}

		int startNull = -1;

		for (int i = 0; i < filteredBooks.length; i++) {
			if (filteredBooks[i] == null) {
				break;
			}
			startNull = i;
		}

		Book[] cleanFilter = new Book[startNull + 1];

		if (cleanFilter.length > 0) {
			for (int i = 0; i < cleanFilter.length; i++) {
				cleanFilter[i] = filteredBooks[i];

			}
		}

		return cleanFilter;
	}
}
