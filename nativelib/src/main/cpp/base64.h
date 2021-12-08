//
// Created by DanielHuang on 2021/12/8.
//

#ifndef NATIVELIBTEST_BASE64_H
#define NATIVELIBTEST_BASE64_H

std::string b64decode(const void* data, const size_t len);

std::string base64_encode(const unsigned char *src, size_t len);

#endif //NATIVELIBTEST_BASE64_H
