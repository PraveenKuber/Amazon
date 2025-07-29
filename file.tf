variable "f1" {
  type    = string
  default = "abc.txt"
}

resource "local_file" "res1" {
  filename = var.f1
  content  = var.f1
}

output "file_output" {
  value = local_file.res1.filename
}
