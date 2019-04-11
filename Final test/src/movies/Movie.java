package movies;

import java.util.Objects;

public class Movie implements Comparable<Movie> {
	String name;
	int year;
	String director;
	String writer;

	public Movie(String name, int year, String director, String writer) {
		this.name = name;
		this.year = year;
		this.director = director;
		this.writer = writer;
	}

	public String getName() {
		return this.name;
	}

	public int getYear() {
		return this.year;
	}

	public String getDirector() {
		return this.writer;
	}

	public String getWriter() {
		return this.writer;
	}

	@Override
	public int compareTo(Movie that) {
		int result = this.name.compareTo(that.name);

		if (result == 0) {
			result = that.year - this.year;
			if (result == 0) {
				result = this.director.compareTo(that.director);
				if (result == 0) {
					result = that.director.compareTo(this.director);
				}
			}
		}

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Movie that = (Movie) obj;
		return this.compareTo(that) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, year, director, writer);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Name: " + this.name + "\n");
		result.append("Year: " + this.year + "\n");
		result.append("Director: " + this.writer + "\n");
		result.append("Writer: " + this.director + "\n");

		return result.toString();
	}
}
