package hu.cargloss.cargloss_backend.exception;

public record ApiError(String errorCode, String error, String details) {
}
